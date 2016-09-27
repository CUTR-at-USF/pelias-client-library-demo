/*
 * Copyright (C) 2016 University of South Florida, Sean J. Barbeau (sjbarbeau@gmail.com)
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
package edu.usf.cutr.pelias.demo;

import edu.usf.cutr.pelias.SearchRequest;
import edu.usf.cutr.pelias.SearchResponse;

import java.io.IOException;

/**
 * A demo project showing the use of the pelias-client-library (https://github.com/CUTR-at-USF/pelias-client-library), a
 * Java client library for the Mapzen Pelias Search API (https://mapzen.com/documentation/search/search/)
 */
public class PeliasClientDemo {

    /**
     * A method to test SearchRequests
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        String apiKey = "search-YOUR_KEY_HERE";
        String text = "London";
        SearchResponse response = new SearchRequest.Builder(apiKey, text).build().call();
        System.out.println(response.toString());
    }
}
