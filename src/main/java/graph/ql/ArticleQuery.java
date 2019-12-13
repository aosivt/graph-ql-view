package graph.ql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ArticleQuery implements GraphQLQueryResolver {

    @Autowired
    private ArticleService service;
    public List<Article> getArticles(final int count) {
        return service.getAllArticles(count);
    }
    public Optional<Article> getArticle(final int id) {
        return this.service.getArticle(id);
    }

}