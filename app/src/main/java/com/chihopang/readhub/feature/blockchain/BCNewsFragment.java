package com.chihopang.readhub.feature.blockchain;

import com.chihopang.readhub.base.BaseListPresenter;
import com.chihopang.readhub.feature.news.NewsFragment;
import com.chihopang.readhub.model.News;

public class BCNewsFragment extends NewsFragment {
  public static final String TAG = "BCNewsFragment";

  public static NewsFragment newInstance() {
    return new BCNewsFragment();
  }

  @Override public BaseListPresenter<News> createPresenter() {
    return new BCNewsPresenter();
  }
}
