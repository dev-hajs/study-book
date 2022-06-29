package _13_loop;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Author {

    private String company;
    private String twitterHandle;

    public Author(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }

    public static List<String> twitterHandles(List<Author> authors, String company) {
        return authors.stream()
                .filter(author -> author.company.equals(company))
                .map(author -> author.twitterHandle)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
