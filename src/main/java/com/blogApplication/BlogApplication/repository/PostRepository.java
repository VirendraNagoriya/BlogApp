package com.blogApplication.BlogApplication.repository;

import com.blogApplication.BlogApplication.Entity.Post;
import com.blogApplication.BlogApplication.Entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post ,Long> {

    //serach by tittle and content containing search item
    Page<Post> findByTitleContainingIgnoreCaseOrContentContainingIgnoreCase(

            String titleTerm,
            String contentTerm,
            Pageable pageable

    ) ;

}
