package com.example.data

import com.example.domain.model.Characters
import com.example.domain.model.Character
import com.example.domain.model.Episodes
import com.example.domain.model.Episode
import com.example.domain.model.Locations
import com.example.domain.model.Location
import kotlinx.coroutines.flow.Flow

interface ApiRepository {

    fun getCharacters(page: Int?): Flow<Characters>

    fun getCharacter(id: Int): Flow<Character>

    fun getLocations(page: Int?): Flow<Locations>

    fun getLocation(id: Int): Flow<Location>

    fun getEpisodes(page: Int?): Flow<Episodes>

    fun getEpisode(id: Int): Flow<Episode>

}