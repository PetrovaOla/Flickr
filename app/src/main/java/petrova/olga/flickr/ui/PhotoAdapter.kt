package petrova.olga.flickr.ui

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import petrova.olga.flickr.models.GalleryItem

class PhotoAdapter(private val galleryItem: List<GalleryItem>) :
    RecyclerView.Adapter<PhotoHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoHolder {
        val textView = TextView(parent.context)
        return PhotoHolder(textView)
    }

    override fun getItemCount(): Int {
        return galleryItem.size
    }

    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
        val galleryItem = galleryItem[position]
        holder.bind(galleryItem.title)
    }
}