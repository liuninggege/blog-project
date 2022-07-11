package top.blog.article.mapper;

import java.util.List;

import top.blog.article.domain.ArtBlog;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author wemoving
 * @date 2022-06-18
 */
public interface ArtBlogMapper {

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
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    int deleteArtBlogById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    int deleteArtBlogByIds(Long[] ids);
}
