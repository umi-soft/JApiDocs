package controller;

import form.UserForm;
import form.UserListForm;
import io.github.yedaxia.apidocs.Ignore;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import result.ApiResult;
import result.PageResult;
import result.user.UserVO;

import javax.servlet.http.HttpServletResponse;

/**
 * 用户接口
 * @author yeguozhong
 */
@RequestMapping("/api/user/")
@RestController
public class UserController {


    /**
     * 用户列表
     * @param listForm
     * @author yedaxia
     */
    @RequestMapping(path = "list", method = {RequestMethod.GET,  RequestMethod.POST}  )
    public ApiResult<PageResult<UserVO>> list(UserListForm listForm){
        return null;
    }

    /**
     * 用户信息
     * @param userId 用户id
     * @author 周杰伦
     */
    @GetMapping("user-info/{userId}")
    public ApiResult<UserVO> userInfo(@PathVariable Long userId){
        return null;
    }

    /**
     * 保存用户
     * @param req
     * @param userForm
     * @return
     */
    @PostMapping(path = "save")
    public ApiResult<UserVO> saveUser(HttpServletResponse req, @RequestBody UserForm userForm){
        return null;
    }

    /**
     * 上传头像
     *
     * @param avatar
     * @return
     */
    @PostMapping("upload-avatar")
    public ApiResult uploadAvatar(MultipartFile avatar){
        return null;
    }

    /**
     * 修改用户信息
     * @param userForm
     * @return
     */
    @PostMapping("modify")
    public ApiResult<UserVO> modifyUser(UserForm userForm){
        return null;
    }

    /**
     * 删除用户
     * @param userId 用户ID
     */
    @PostMapping("delete")
    public ApiResult deleteUser(@RequestParam Long userId){
        return null;
    }

    public ApiResult hello(){
        return null;
    }

    /**
     * 获取图片
     */
    @GetMapping("get-image")
    public void getImage(){

    }

    /**
     * 用户列表2
     *
     * @param userId 用户ID
     * @param user
     * @return
     */
    @GetMapping("list2")
    public ApiResult<UserVO> list2(@RequestParam Long userId, @RequestBody UserForm user){
        return null;
    }

    /**
     * 忽略该接口
     * @return
     */
    @Ignore
    @PostMapping("ignore")
    public ApiResult ignore(){
        return null;
    }
}
