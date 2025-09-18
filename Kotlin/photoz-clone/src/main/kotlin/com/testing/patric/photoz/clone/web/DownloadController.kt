package com.testing.patric.photoz.clone.web

import com.testing.patric.photoz.clone.service.PhotosService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ContentDisposition
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
class DownloadController (@Autowired val photosService : PhotosService) {

    @GetMapping("/download/{id}")
    fun download(@PathVariable id : Int) : ResponseEntity<ByteArray> {
        val photo = photosService.getById(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "File Not found!")
        val headers = HttpHeaders().apply{
            contentType = photo.contentType?.let { MediaType.valueOf(it) }
            contentDisposition = ContentDisposition
                .builder("attachment")
                .filename(photo.fileName)
                .build()
        }
        return ResponseEntity(photo.data, headers, HttpStatus.OK)
    }

}