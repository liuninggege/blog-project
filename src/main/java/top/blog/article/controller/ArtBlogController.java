package top.blog.article.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.blog.article.domain.ArtBlog;
import top.blog.article.service.ArtBlogService;
import top.blog.common.core.controller.BaseController;
import top.blog.common.core.domain.Result;

import javax.annotation.Resource;

/**
 * 博客Controller
 *
 * @author wemoving
 * @date 2022-06-18
 */
@RestController
@RequestMapping("/article/blog")
public class ArtBlogController extends BaseController {

    @Resource
    private ArtBlogService artBlogService;

    /**
     * 查询博客列表
     */
    @GetMapping("/list")
    public Result list(ArtBlog artBlog) {
        startPage();
        List<ArtBlog> list = artBlogService.selectArtBlogList(artBlog);
        return Result.success(list);
    }

    /**
     * 获取博客详细信息
     */
    @GetMapping(value = "/{id}")
    public Result getInfo(@PathVariable("id") Long id) {
        return Result.success(artBlogService.selectArtBlogById(id));
    }

    /**
     * 新增博客
     */
    @PostMapping
    public Result add(@RequestBody ArtBlog artBlog) {
        return Result.success(artBlogService.insertArtBlog(artBlog));
    }

    /**
     * 修改博客
     */
    @PutMapping
    public Result edit(@RequestBody ArtBlog artBlog) {
        return Result.success(artBlogService.updateArtBlog(artBlog));
    }

    /**
     * 删除博客
     */
    @DeleteMapping("/{ids}")
    public Result remove(@PathVariable Long[] ids) {
        return Result.success(artBlogService.deleteArtBlogByIds(ids));
    }

}
