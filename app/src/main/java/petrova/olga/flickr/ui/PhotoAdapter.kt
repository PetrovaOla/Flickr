package petrova.olga.flickr.ui

import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import petrova.olga.flickr.R
import petrova.olga.flickr.databinding.ListItemGalleryBinding
import petrova.olga.flickr.models.GalleryItem

class PhotoAdapter(
    private val galleryItem: List<GalleryItem>
) : RecyclerView.Adapter<PhotoHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoHolder {
        val binding = ListItemGalleryBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        val view = binding.image
        return PhotoHolder(binding, view)
    }

    override fun getItemCount(): Int {
        return galleryItem.size
    }

    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
        val galleryItem = galleryItem[position]
        val placeholder: Drawable = ContextCompat.getDrawable(
            holder.itemView.context,
            R.drawable.album
        ) ?: ColorDrawable()
        holder.bind(placeholder)
    }
}