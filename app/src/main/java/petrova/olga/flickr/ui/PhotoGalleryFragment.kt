package petrova.olga.flickr.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import petrova.olga.flickr.R
import petrova.olga.flickr.api.FlickrFetchr
import petrova.olga.flickr.databinding.FragmentPhotoGalleryBinding
import petrova.olga.flickr.models.GalleryItem

class PhotoGalleryFragment : Fragment() {

    private var _binding: FragmentPhotoGalleryBinding? = null
    private val binding get() = _binding!!

    private lateinit var photoRecyclerView: RecyclerView
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        /*val flickrLiveData:LiveData<List<GalleryItem>> = FlickrFetchr().fetchPhotos()

                flickrLiveData.observe(
                    this,
                    Observer { galleryItems ->
                        Log.d(TAG,"Response received: $galleryItems")
                    }
                )*/

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPhotoGalleryBinding.inflate(inflater, container, false)

        val view = binding.root
            photoRecyclerView = binding.photoRecyclerView
        photoRecyclerView.layoutManager = GridLayoutManager(context, 3)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainViewModel.galleryItemLiveData.observe(
            viewLifecycleOwner,
            Observer { galleryItems ->
                Log.d(TAG, "Have gallery items from viewModel $galleryItems")
                photoRecyclerView.adapter = PhotoAdapter(galleryItems)
            }
        )

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = PhotoGalleryFragment()

        private const val TAG = "PhotoGalleryFragment"
    }

}