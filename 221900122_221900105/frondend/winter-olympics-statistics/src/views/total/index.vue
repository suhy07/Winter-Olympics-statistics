<template> 
    <div class="total-container">
        <div class="total-card total-body">
            <div class="total-card total-title">
                <h1>标题1111</h1>
            </div>
        </div>
    </div>
</template>
<script>
import BaseHead from '@/components/base-head'
export default{
    data() {
        return {
        }
    },
    components: {
        BaseHead,
    }
}
</script>
<style scoped>
.total-container{
    position: absolute;
    top: 5px;
    width:80.3%;
}
.total-card{
    width: 100%;
    height: 41px;
    background: inherit;
    background-color: rgba(255, 255, 255, 1);
    box-sizing: border-box;
    border-width: 1px;
    border-radius: 188px;
    box-shadow: 0px 0px 10px rgb(170 170 170 / 35%);
    border-style: dotted;
    border-color: rgb(0, 0, 0);
}
</style>