package com.testing.patric.photoz.clone.web

import com.testing.patric.photoz.clone.model.Photo
import com.testing.patric.photoz.clone.service.PhotosService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.server.ResponseStatusException


@RestController
@CrossOrigin(origins = ["*"])
class PhotosController (@Autowired val photosService : PhotosService){

    @GetMapping("/")
    fun hello() : String {
        return "Hello World"
    }

    @GetMapping("/photos")
    fun getPhotos() : MutableIterable<Photo> {
        return photosService.get()
    }

    @GetMapping("/photos/{id}")
    fun getPhoto(@PathVariable id : Int) : Photo {
        val photo : Photo = photosService.getById(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
        return photo
    }

    @DeleteMapping("/photos/{id}")
    fun delete(@PathVariable id : Int){
        photosService.remove(id)
    }

    @PostMapping("/photos")
    fun create(@RequestPart("data") file : MultipartFile ) : Photo {
        val photo: Photo = photosService.save(
            file.originalFilename.toString(),
            file.bytes,
            file.contentType.toString())
        return photo
    }

}