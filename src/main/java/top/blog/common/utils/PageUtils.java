package top.blog.common.utils;

import com.github.pagehelper.PageHelper;
import top.blog.common.core.page.PageDomain;
import top.blog.common.core.page.TableSupport;
import top.blog.common.utils.sql.SqlUtil;

/**
 * @author : liuning
 * @version 1.0
 * @create :2022-05-01 18:59:00
 */
public class PageUtils extends PageHelper {

    /**
     * 设置请求分页数据
     */
    public static void startPage() {
        PageDomain pageDomain = TableSupport.buildPageRequest();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize)) {
            String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
            Boolean reasonable = pageDomain.getReasonable();
            PageHelper.startPage(pageNum, pageSize, orderBy).setReasonable(reasonable);
        }
    }

}
