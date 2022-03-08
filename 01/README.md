# 关于项目

参考：码神之路

### 项目环境：IDEA2018.3.6 + MySQL8.0.13 + Vue2 + Maven3.6.1

### 跨域问题处理：

>   通过 CORS 来解决跨域问题，只不过之前我们是在 XML 文件中配置 CORS ，现在可以通过**实现WebMvcConfigurer接口然后重写addCorsMappings方法解决跨域问题**
>
> ​	`WebMVCConfig implements WebMvcConfigurer`

重写父类提供的跨域请求处理的接口

```
@Override
public void addCorsMappings(CorsRegistry registry)
```

### 首页内容 - 最热标签-最热文章 - 文章归档-最新文章

