package com.bluetoya.kotodo

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean

class BlogConfiguration {

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository) = ApplicationRunner {

        val johnDoe = userRepository.save(User("johnDoe", "John", "Doe"))
        articleRepository.save(Article(
            title = "Lorem",
            headline = "Lorem",
            content = "dolor sit amet",
            author = johnDoe
        ))
        articleRepository.save(Article(
            title = "Ipsum",
            headline = "Ipsum",
            content = "dolor sit amet",
            author = johnDoe
        ))
    }
}