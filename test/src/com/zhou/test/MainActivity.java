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
	// "third", "fourth", "fifth" };// ����һ��String����������ʾListView������
	private ListView lv;
	/* ����һ����̬���� */
	ArrayList<HashMap<String, Object>> listItem;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lv = (ListView) findViewById(R.id.lv);
		MyAdapter mAdapter = new MyAdapter(this);// �õ�һ��MyAdapter����
		lv.setAdapter(mAdapter);// ΪListView��Adapter
		/* ΪListView��ӵ���¼� */
		lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Log.v("MyListViewBase", "������ListView��Ŀ" + arg2);// ��LogCat�������Ϣ
				setTitle("�����˵�"+(arg2 + 1)+"��");

			}
		});

		// SimpleAdapter
		// lv = (ListView) findViewById(R.id.lv);// �õ�ListView���������
		// /* ����һ����̬���� */
		// ArrayList<HashMap<String, Object>> listItem = new
		// ArrayList<HashMap<String, Object>>();
		// /* �������д������ */
		// for (int i = 0; i < 10; i++) {
		// HashMap<String, Object> map = new HashMap<String, Object>();
		// map.put("ItemImage", R.drawable.ic_launcher);// ����ͼƬ
		// map.put("ItemTitle", "��" + (i + 1) + "��");
		// map.put("ItemText", "���ǵ�" + (i + 1) + "��");
		// listItem.add(map);
		// }
		//
		// SimpleAdapter mSimpleAdapter = new SimpleAdapter(
		// this,
		// listItem,// ��Ҫ�󶨵�����
		// R.layout.item,// ÿһ�еĲ���
		// // ��̬�����е�����Դ�ļ���Ӧ�����岼�ֵ�View��
		// new String[] { "ItemImage", "ItemTitle", "ItemText" },
		// new int[] { R.id.ItemImage, R.id.ItemTitle, R.id.ItemText });
		//
		// lv.setAdapter(mSimpleAdapter);// ΪListView��������
		//
		// lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
		//
		// @Override
		// public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
		// long arg3) {
		// setTitle("�����˵�" + (arg2 + 1) + "��");// ���ñ�������ʾ�������
		//
		// }
		// });
		// demo1 // /* ΪListView����Adapter�������� */
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
		// setTitle("�����˵�"+(position + 1)+"��");
		// }
		// });
	}

}
