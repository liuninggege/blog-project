package top.blog.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.blog.common.core.controller.BaseController;
import top.blog.common.core.domain.Result;
import top.blog.system.domain.SysUser;
import top.blog.system.service.SysUserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户信息Controller
 *
 * @author liuning
 * @date 2022-06-17
 */
@RestController
@RequestMapping("/system/user")
public class SysUserController extends BaseController {

    @Resource
    private SysUserService sysUserService;

    /**
     * 查询用户信息列表
     */
    @GetMapping("/list")
    public Result list(SysUser sysUser) {
        startPage();
        List<SysUser> list = sysUserService.selectSysUserList(sysUser);
        return Result.success(list);
    }

    /**
     * 获取用户信息详细信息
     */
    @GetMapping(value = "/{userId}")
    public Result getInfo(@PathVariable("userId") Long userId) {
        return Result.success(sysUserService.selectSysUserByUserId(userId));
    }

    /**
     * 新增用户信息
     */
    @PostMapping
    public Result add(@RequestBody SysUser sysUser) {
        return Result.success(sysUserService.insertSysUser(sysUser));
    }

    /**
     * 修改用户信息
     */
    @PutMapping
    public Result edit(@RequestBody SysUser sysUser) {
        return Result.success(sysUserService.updateSysUser(sysUser));
    }

    /**
     * 删除用户信息
     */
    @DeleteMapping("/{userIds}")
    public Result remove(@PathVariable Long[] userIds) {
        return Result.success(sysUserService.deleteSysUserByUserIds(userIds));
    }

}
