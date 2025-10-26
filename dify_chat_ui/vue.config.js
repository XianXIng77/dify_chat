const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    port: 7000, // 前端开发服务器端口
    proxy: {
      '/api': {
        target: 'http://localhost:8080', // 后端API服务器地址
        changeOrigin: true, // 是否改变请求源
        pathRewrite: {
          '^/api': '' // 移除URL中的/api前缀
        },
        ws: true, // 支持WebSocket
        secure: false // 如果是https，需要设置为true
      }
    }
  }
})
