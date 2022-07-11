package top.blog.article.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import top.blog.article.domain.ArtBlog;
import top.blog.article.mapper.ArtBlogMapper;
import top.blog.article.service.ArtBlogService;
import top.blog.common.utils.DateUtils;

import javax.annotation.Resource;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author wemoving
 * @date 2022-06-18
 */
@Service
public class ArtBlogServiceImpl implements ArtBlogService {

    @Resource
    private ArtBlogMapper artBlogMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public ArtBlog selectArtBlogById(Long id) {
        return artBlogMapper.selectArtBlogById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param artBlog 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<ArtBlog> selectArtBlogList(ArtBlog artBlog) {
        return artBlogMapper.selectArtBlogList(artBlog);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param artBlog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertArtBlog(ArtBlog artBlog) {
        artBlog.setCreateTime(DateUtils.getNowDate());
        return artBlogMapper.insertArtBlog(artBlog);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param artBlog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateArtBlog(ArtBlog artBlog) {
        artBlog.setUpdateTime(DateUtils.getNowDate());
        return artBlogMapper.updateArtBlog(artBlog);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteArtBlogByIds(Long[] ids) {
        return artBlogMapper.deleteArtBlogByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteArtBlogById(Long id) {
        return artBlogMapper.deleteArtBlogById(id);
    }
}
