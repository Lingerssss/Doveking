function main(){
    let fs = require("fs");
    let data = fs.readFileSync('ass2_sample_input');
    let raw = data.toString().split("\n")
    

    let serverCount = parseInt(raw[0]);
    // let serverCount = 2;
    // let jobs = [[1,2,0],[2,4,0],[3,1,0],[4,2,0],[5,1,0]]
    let jobs  = [];

    let k = 1;

    // 去除多余的一行
    while(k < raw.length-1){
        let data = raw[k].split(" ")
        jobs.push([parseFloat(data[0]),parseFloat(data[1]),0])
        k++
    }
    let serverState = Array.from({length:serverCount},() => [[0,0]])
    let i =0;
    let j = 0;
    let maxQ = Number.NEGATIVE_INFINITY;
    while(i < jobs.length){
        let min = Number.POSITIVE_INFINITY;
        let index = 0;
        serverState.forEach((e,k)=> {

            if(e[e.length-1][0] < min){
                min =e[e.length-1][0]
                index = k
            }

        });

        // serverState.sort((a,b) => {
        //     return  a[a.length-1][0] - b[b.length-1][0]
        // })
        // 第一个可用服务
        let fAS = serverState[index];
        // 第一个可用服务的长度
        let fASL = serverState[index].length

        // 实际服务开始时间
        let sT = Math.max(fAS[fASL-1][0],jobs[i][0])
        // 实际服务的时间内的都应该进入队列
        while(j < jobs.length && sT >= jobs[j][0]){
            j++
        }
        maxQ = Math.max(maxQ, j-i)
        fAS[fASL-1][1] = sT
        jobs[i][2] = sT

        fAS.push([fAS[fASL-1][1] + jobs[i][1],0])
        i++
    }
    // for (let index = 0; index < serverState.length; index++) {
    //     serverState[index].pop()
        
    // }

    // Number of people served.
    //  Time that the last customer being completely served (total simulation time).
    //  Average service time (note this should depend only on the input file).
    //  Average time a customer spends in queue.
    //  Maximum time a customer spends in queue.
    //  Average length of queue in any given second. For each queue and in total for the multi-queue version of the simulation.
    //  Maximum Length of queue. For each queue and in total for the multi-queue version of the simulation.
    //  Total idle time for each server. 
    console.log("Number of people served:",jobs.length)
    console.log("Time that the last customer being completely served",jobs[jobs.length-1][2]+jobs[jobs.length-1][1])
    console.log("Average service time:",jobs.reduce((a,c) => {
        return c[1] + a
    },0)/serverCount)
    console.log("Average time a customer spends in queue:",jobs.reduce((a,c) => {
        return c[2]-c[0] + a
    },0)/jobs.length)
    console.log("Maximum time a customer spends in queue",Math.max(...jobs.map(x => x[2]-x[0])))
    console.log("Average length of queue in any given second. For each queue and in total for the multi-queue version of the simulation.:","???")
    console.log("Maximum Length of queue:",maxQ)
    console.log("Total idle time for each server:",serverState.map((x) =>{
        let workTime = 0
        for(let i = 1; i < x.length; i++){
            workTime += x[i][0] - x[i-1][1]
        }
        return jobs[jobs.length-1][2]+jobs[jobs.length-1][1] - workTime
    }))
}

main()