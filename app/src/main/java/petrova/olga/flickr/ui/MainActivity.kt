package petrova.olga.flickr.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import petrova.olga.flickr.R
import petrova.olga.flickr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val isFragmentContainerEmpty = savedInstanceState == null
        if(isFragmentContainerEmpty){
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer, PhotoGalleryFragment.newInstance())
                .commit()
        }
    }

}