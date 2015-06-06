package com.spotify.gil.spotifystreamer.async;

import android.os.AsyncTask;
import android.text.TextUtils;

import com.spotify.gil.spotifystreamer.util.Spotify;

import kaaes.spotify.webapi.android.models.Artists;
import kaaes.spotify.webapi.android.models.ArtistsPager;

/**
 * Created by GIL on 30/05/2015.
 */
public class SearchArtistsAsyncTask extends AsyncTask<String, Artists, ArtistsPager> {

    @Override
    protected ArtistsPager doInBackground(String... params) {

        final String searchString = params != null && params.length > 0 ? params[0] : null;

        if (TextUtils.isEmpty(searchString)) {
            return null;
        }

        return Spotify.searchArtists(searchString);
    }
}
