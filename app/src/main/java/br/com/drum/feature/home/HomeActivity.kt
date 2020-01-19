package br.com.drum.feature.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.drum.R
import kotlinx.android.synthetic.main.activity_home.*
import org.koin.androidx.fragment.android.setupKoinFragmentFactory

class HomeActivity : AppCompatActivity(R.layout.activity_home) {

    override fun onCreate(savedInstanceState: Bundle?) {
        setupKoinFragmentFactory()
        super.onCreate(savedInstanceState)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
            .add(content.id, HomeFragment::class.java, null, null)
            .commit()
    }
}
