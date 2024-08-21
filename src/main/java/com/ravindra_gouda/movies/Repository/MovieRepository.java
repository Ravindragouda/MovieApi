package com.ravindra_gouda.movies.Repository;

import com.ravindra_gouda.movies.Entity.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{
}
