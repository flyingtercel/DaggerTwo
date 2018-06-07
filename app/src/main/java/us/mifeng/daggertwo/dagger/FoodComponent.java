package us.mifeng.daggertwo.dagger;

import dagger.Component;
import us.mifeng.daggertwo.MainActivity;

/**
 * Created by 黑夜之火 on 2018/6/6.
 */
@Component(modules = FoodModule.class)
public interface FoodComponent {
    void injects(MainActivity activity);
}
/*
* 统计
* 分享
* 推送
* 验证
* 地图
* im
* 直播
* vitarmio视频播放
*
*
* */