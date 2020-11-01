package ee.allan.itproger.webBlog.controllers;


import ee.allan.itproger.webBlog.models.Article;
import ee.allan.itproger.webBlog.repo.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class blogController {

    @Autowired
    private ArticleRepository articleRepository;
    
    @GetMapping("/blog")
    public String blogMain(Model model) {
        Iterable<Article> articles = articleRepository.findAll();
        model.addAttribute("articles", articles);
            return "blog-main";
    }

    @GetMapping("/blog/add")
    public String blogAdd (Model model){
         return "blog-add";
    }

    @PostMapping("/blog/add")
    public String blogPostAdd(@RequestParam String title,
                              @RequestParam String anons,
                              @RequestParam String full_text,
                              Model model) {
        Article article = new Article(title, anons, full_text);
        articleRepository.save(article);
        return "redirect:/blog";
    }

    @GetMapping("/blog/{id}")
    public String blogDetailsOfArticle
            (@PathVariable(value = "id") long id,
             Model model){
        //TODO create article not exist page
        if(!articleRepository.existsById(id)){
            return "redirect:/blog";
        }

        Optional<Article> article = articleRepository.findById(id);
        ArrayList<Article> result = new ArrayList<>();
        article.ifPresent(result::add);
        model.addAttribute("article", result);
        return "blog-details";
    }

    @GetMapping("/blog/{id}/edit")
    public String blogEditArticle
            (@PathVariable(value = "id") long id,
             Model model){
        //TODO create article not exist page
        if(!articleRepository.existsById(id)){
            return "redirect:/blog";
        }

        Optional<Article> article = articleRepository.findById(id);
        ArrayList<Article> result = new ArrayList<>();
        article.ifPresent(result::add);
        model.addAttribute("article", result);
        return "blog-edit";
    }

    @PostMapping("/blog/{id}/edit")
    public String blogPostUpdate(@PathVariable(value = "id") long id, @RequestParam String title,
                              @RequestParam String anons,
                              @RequestParam String full_text,
                              Model model) throws Exception {
        Article article = articleRepository.findById(id).orElseThrow(
                () -> new Exception("Article not found")
        );
        article.setTitle(title);
        article.setAnons(anons);
        article.setFullText(full_text);
        articleRepository.save(article);
        return "redirect:/blog";
    }

    @PostMapping("/blog/{id}/delete")
    public String blogPostDelete(@PathVariable(value = "id") long id,
                                 Model model) throws Exception {
        Article article = articleRepository.findById(id).orElseThrow(
                () -> new Exception("Article not found")
        );
        articleRepository.delete(article);
        return "redirect:/blog";
    }

}
