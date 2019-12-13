package graph.ql;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(final ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Transactional
    public Article createVehicle(final String name1, final String name2, final String note, final String ecrlongname, final String ecrshortname, final Boolean hasMRC) {
        final Article article = new Article();
        article.setName1(name1);
        article.setName2(name2);
        article.setNote(note);
        article.setEcrlongname(ecrlongname);
        article.setEcrshortname(ecrshortname);
        return this.articleRepository.save(article);
    }

    @Transactional(readOnly = true)
    public List<Article> getAllArticles(final int count) {
        return this.articleRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Article> getArticle(final int id) {
        return this.articleRepository.findById(String.valueOf(id));
    }
}