/*
 * Copyright 2019 Florian Schuster.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tailoredapps.androidutil.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes


/**
 * Inflates a View in a ViewGroup.
 */
fun <V : ViewGroup> V.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View =
    LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)

