package com.zhou.test;

import java.util.ArrayList;
import java.util.HashMap;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends ActionBarActivity {

	// private static final String[] strs = new String[] { "first", "second",
	// "third", "fourth", "fifth" };// 定义一个String数组用来显示ListView的内容
	private ListView lv;
	/* 定义一个动态数组 */
	ArrayList<HashMap<String, Object>> listItem;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lv = (ListView) findViewById(R.id.lv);
		MyAdapter mAdapter = new MyAdapter(this);// 得到一个MyAdapter对象
		lv.setAdapter(mAdapter);// 为ListView绑定Adapter
		/* 为ListView添加点击事件 */
		lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Log.v("MyListViewBase", "你点击了ListView条目" + arg2);// 在LogCat中输出信息
				setTitle("你点击了第"+(arg2 + 1)+"行");

			}
		});

		// SimpleAdapter
		// lv = (ListView) findViewById(R.id.lv);// 得到ListView对象的引用
		// /* 定义一个动态数组 */
		// ArrayList<HashMap<String, Object>> listItem = new
		// ArrayList<HashMap<String, Object>>();
		// /* 在数组中存放数据 */
		// for (int i = 0; i < 10; i++) {
		// HashMap<String, Object> map = new HashMap<String, Object>();
		// map.put("ItemImage", R.drawable.ic_launcher);// 加入图片
		// map.put("ItemTitle", "第" + (i + 1) + "行");
		// map.put("ItemText", "这是第" + (i + 1) + "行");
		// listItem.add(map);
		// }
		//
		// SimpleAdapter mSimpleAdapter = new SimpleAdapter(
		// this,
		// listItem,// 需要绑定的数据
		// R.layout.item,// 每一行的布局
		// // 动态数组中的数据源的键对应到定义布局的View中
		// new String[] { "ItemImage", "ItemTitle", "ItemText" },
		// new int[] { R.id.ItemImage, R.id.ItemTitle, R.id.ItemText });
		//
		// lv.setAdapter(mSimpleAdapter);// 为ListView绑定适配器
		//
		// lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
		//
		// @Override
		// public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
		// long arg3) {
		// setTitle("你点击了第" + (arg2 + 1) + "行");// 设置标题栏显示点击的行
		//
		// }
		// });
		// demo1 // /* 为ListView设置Adapter来绑定数据 */
		// // lv.setAdapter(new ArrayAdapter<String>(this,
		// // android.R.layout.simple_list_item_1, strs));
		// // lv.setAdapter(new ArrayAdapter<String>(this,
		// // android.R.layout.simple_list_item_multiple_choice, strs));
		// // lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
		// lv.setAdapter(new ArrayAdapter<String>(this,
		// android.R.layout.simple_list_item_single_choice, strs));
		// lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		//
		// lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
		// @Override
		// public void onItemClick(AdapterView<?> parent, View view,
		// int position, long id) {
		// // TODO Auto-generated method stub
		// setTitle("你点击了第"+(position + 1)+"行");
		// }
		// });
	}

}
