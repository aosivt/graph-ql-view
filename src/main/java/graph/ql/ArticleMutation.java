package graph.ql;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArticleMutation implements GraphQLMutationResolver {

    @Autowired
    private ArticleService service;

    public Article createVehicle(final String name1, final String name2, final String note, final String ecrlongname, final String ecrshortname, final Boolean hasMRC) {
        return this.service.createVehicle(name1, name2,  note,  ecrlongname, ecrshortname, hasMRC);
    }

}