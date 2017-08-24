package com.vgrec.espressoexamples.provider;

import android.content.SearchRecentSuggestionsProvider;

public class AppRecentSearchesProvider extends SearchRecentSuggestionsProvider {

    public final static String AUTHORITY = "com.vgrec.espressoexamples";
    public final static int MODE = DATABASE_MODE_QUERIES;

    public AppRecentSearchesProvider() {
        setupSuggestions(AUTHORITY, MODE);
    }

}
