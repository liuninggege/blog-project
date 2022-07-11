package top.blog.article.service;

import java.util.List;

import top.blog.article.domain.ArtBlog;

/**
 * 【请填写功能名称】Service接口
 *
 * @author wemoving
 * @date 2022-06-18
 */
public interface ArtBlogService {

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    ArtBlog selectArtBlogById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param artBlog 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    List<ArtBlog> selectArtBlogList(ArtBlog artBlog);

    /**
     * 新增【请填写功能名称】
     *
     * @param artBlog 【请填写功能名称】
     * @return 结果
     */
    int insertArtBlog(ArtBlog artBlog);

    /**
     * 修改【请填写功能名称】
     *
     * @param artBlog 【请填写功能名称】
     * @return 结果
     */
    int updateArtBlog(ArtBlog artBlog);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    int deleteArtBlogByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    int deleteArtBlogById(Long id);
}
