package org.shellzero.youtubedemoapp;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class YouTubeActivity extends YouTubeBaseActivity implements
		YouTubePlayer.OnInitializedListener {

	public static final String GOOGLE_YOUTUBE_API_KEY = "AIzaSyDug1kgMBaxpXl7bbm6ZwrEds66rvO2rEM";

	public static final String YOUTUBE_VIDEO_ID = "R81hicmW2Jw";

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.youtube_main);
		YouTubePlayerView youTubePlayView = (YouTubePlayerView) findViewById(R.id.youtube_player);
		youTubePlayView.initialize(GOOGLE_YOUTUBE_API_KEY, this);

	}

	public void onInitializationFailure(Provider provider,
			YouTubeInitializationResult result) {
		Toast.makeText(this, "Cannot initialize Youtube player",
				Toast.LENGTH_LONG).show();
	}

	public void onInitializationSuccess(Provider provider,
			YouTubePlayer player, boolean wasRestored) {
		player.setPlayerStateChangeListener(playerStateChangeListener);
		player.setPlaybackEventListener(playbackEventListener);

		if (!wasRestored) {
			player.cueVideo(YOUTUBE_VIDEO_ID);
		}

	}

	private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {

		public void onBuffering(boolean arg0) {

		}

		public void onPaused() {

		}

		public void onPlaying() {

		}

		public void onSeekTo(int arg0) {

		}

		public void onStopped() {

		}

	};

	private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener() {

		public void onAdStarted() {

		}

		public void onError(ErrorReason arg0) {
		}

		public void onLoading() {

		}

		public void onLoaded(String arg0) {

		}

		public void onVideoStarted() {

		}

		public void onVideoEnded() {

		}
	};

}
