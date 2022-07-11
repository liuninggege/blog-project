package top.blog.article.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import top.blog.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 art_blog
 *
 * @author wemoving
 * @date 2022-06-18
 */
@Data
public class ArtBlog extends BaseEntity {

    /**
     * 主键
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 内容
     */
    private String content;

}
