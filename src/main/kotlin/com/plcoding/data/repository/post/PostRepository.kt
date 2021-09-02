package com.plcoding.data.repository.post

import com.plcoding.data.models.Post
import com.plcoding.util.Constants

interface PostRepository {

    suspend fun createPostIfUserExists(post: Post): Boolean

    suspend fun deletePost(postId: String)

    suspend fun getPostsByFollows(
        userId: String,
        page: Int = 0,
        pageSize: Int = Constants.DEFAULT_POST_PAGE_SIZE
    ): List<Post>
}