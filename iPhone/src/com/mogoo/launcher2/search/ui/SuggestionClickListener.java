/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mogoo.launcher2.search.ui;

/**
 * Listener interface for clicks on suggestions.
 */
public interface SuggestionClickListener {
    /**
     * Called when a suggestion is clicked.
     *
     * @param position Position of the clicked suggestion.
     */
    void onSuggestionClicked(int position);
    /**
     * Called when a suggestion is long clicked.
     *
     * @param position Position of the long clicked suggestion.
     */
    boolean onSuggestionLongClicked(int position);
}
