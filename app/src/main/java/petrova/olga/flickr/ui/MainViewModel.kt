package petrova.olga.flickr.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import petrova.olga.flickr.api.FlickrFetchr
import petrova.olga.flickr.models.GalleryItem

class MainViewModel:ViewModel() {
    val galleryItemLiveData:LiveData<List<GalleryItem>>
    init {
        galleryItemLiveData = FlickrFetchr().fetchPhotos()
    }
}