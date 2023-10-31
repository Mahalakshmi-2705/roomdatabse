package com.example.myapp.db


import androidx.room.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
@Dao
interface VideoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertVideo(video: VideoEntity): Long

    @Query("SELECT * FROM videos")
    fun getAllVideos(): Flow<List<VideoEntity>>
}

