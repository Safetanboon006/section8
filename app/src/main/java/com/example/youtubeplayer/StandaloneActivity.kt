package com.example.youtubeplayer

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.youtube.player.YouTubeStandalonePlayer
import kotlinx.android.synthetic.main.activity_standalone.*

class StandaloneActivity :AppCompatActivity(),View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standalone)

        btnPlayVideo.setOnClickListener(this)
        btnPlaylist.setOnClickListener(this)

    //    btnPlayVideo.setOnClickListener(object :View.OnClickListener{
   //        override fun onClick(p0: View?) {
   //             TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
   //         }
   //     })
   //     btnPlayVideo.setOnClickListener(View.OnClickListener {v->
    //        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
   //     })
  //      val listener=View.OnClickListener {
  //          TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
 //       }
 //       btnPlayVideo.setOnClickListener(listener)
 //       btnPlaylist.setOnClickListener(listener)
    }

    override fun onClick(p0: View?) {
        val intent=when(view.id){
            R.id.btnPlayVideo->YouTubeStanlonePlayer.createVideoIntent(
                this,getString(R.string.GOOGLE_API_KEY),YOUTUBE_VIDEO_ID,0,true,false
            )
            R.id.btnPlaylist->ouTubeStanlonePlayer.createPlaylistIntent(
                this,getString(R.string.GOOGLE_API_KEY),YOUTUBE_PLAYLIST,0,0,true,true
            )
            else->throw IllegalAccessException("Undefined button clicked")
        }
        startActivity(intent)
    }
}