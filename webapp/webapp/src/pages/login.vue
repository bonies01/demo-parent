<template>
  <div style="display: flex; justify-content: center; align-items: center;">
    <el-form :model="form" label-width="80px">
      <el-row>
        <el-col >
          <el-form-item label="用户名">
            <el-input v-model="form.username"></el-input>
          </el-form-item>
        </el-col>
      </el-row>
      <el-row>
        <el-col>
          <el-form-item label="密码">
            <el-input v-model="form.password"></el-input>
          </el-form-item>
        </el-col>
      </el-row>
      <el-row>
        <el-col :span="4">
          <el-form-item>
            <el-button type="primary" @click="login">登录</el-button>
          </el-form-item>
        </el-col>
      </el-row>

    </el-form>
  </div>

</template>

<script>
import axios from "@/api/axios.js"

export default {
  name: "login",
  data(){
    return {
      form:{
        username:"",
        password:""
      }
    }
  },
  methods:{
    login(){
      let conf={
          headers:{
            Authorization:sessionStorage.getItem("token")
          }
      }
      axios.post("/login",this.form,conf).then(res=>{
        console.log("res",res)
        let token=res.headers.get("token")
        console.log("token",token)
        sessionStorage.setItem("token",token)
        this.$router.replace('/home')
      })
    }
  }
}
</script>

<style scoped>

</style>
