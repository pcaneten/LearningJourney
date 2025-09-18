package com.testing.patric.photoz.clone.repository

import com.testing.patric.photoz.clone.model.Photo
import org.springframework.data.repository.CrudRepository

interface PhotosRepository : CrudRepository<Photo, Int> {
}