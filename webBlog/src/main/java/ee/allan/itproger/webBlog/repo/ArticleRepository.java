package ee.allan.itproger.webBlog.repo;

import ee.allan.itproger.webBlog.models.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends
        CrudRepository<Article, Long> {
}
