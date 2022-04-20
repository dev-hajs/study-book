package com.springboot.book.domain.posts;

import com.springboot.book.domain.posts.Posts;
import com.springboot.book.domain.posts.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest // 여기서 별 설정이 없을 경우 H2 데이터베이스를 자동으로 실행해줌
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        // given
        String title = "테스트 게시글";
        String content = "테스트 본문";
        Posts posts = Posts.builder()
                .title(title)
                .content(content)
                .author("dev-hajs@gmail.com")
                .build();

        // when
        postsRepository.save(posts);
        List<Posts> postsList = postsRepository.findAll();

        // then
        Posts findPosts = postsList.get(0);
        assertThat(findPosts.getTitle()).isEqualTo(title);
        assertThat(findPosts.getContent()).isEqualTo(content);
    }
}
