package com.testing.patric.photoz.clone.service

import com.testing.patric.photoz.clone.model.Photo
import com.testing.patric.photoz.clone.repository.PhotosRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.util.*

@Service
class PhotosService (val PhotosRepository : PhotosRepository) {

    fun get() : MutableIterable<Photo> {
        return PhotosRepository.findAll()
    }

    fun getById(id : Int) : Photo? {
        return PhotosRepository.findById(id).orElse(null)
    }

    fun remove(id : Int) {
        PhotosRepository.deleteById(id)
    }

    fun save(fileName: String, data: ByteArray, contentType: String) : Photo {
        val photo = Photo(null, fileName, data, contentType)
        PhotosRepository.save(photo)
        return photo
    }

}