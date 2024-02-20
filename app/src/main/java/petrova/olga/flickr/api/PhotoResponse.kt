package petrova.olga.flickr.api

import com.google.gson.annotations.SerializedName
import petrova.olga.flickr.models.GalleryItem

class PhotoResponse {
    @SerializedName("photo") lateinit var galleryItem: List<GalleryItem>
}