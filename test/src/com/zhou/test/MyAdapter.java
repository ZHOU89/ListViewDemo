package com.zhou.test;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

	private LayoutInflater mInflater;// �õ�һ��LayoutInfalter�����������벼��

	/* ���캯�� */
	public MyAdapter(Context context) {
		this.mInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {

		return getDate().size();// ��������ĳ���
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	/* ������ϸ���͸÷��� */
	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		// �۲�convertView��ListView�������
		Log.v("MyListViewBase", "getView " + position + " " + convertView);
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.item, null);
			holder = new ViewHolder();
			/* �õ������ؼ��Ķ��� */
			holder.title = (TextView) convertView.findViewById(R.id.ItemTitle);
			holder.text = (TextView) convertView.findViewById(R.id.ItemText);
			holder.bt = (Button) convertView.findViewById(R.id.ItemButton);
			convertView.setTag(holder);// ��ViewHolder����
		} else {
			holder = (ViewHolder) convertView.getTag();// ȡ��ViewHolder����
		}
		/* ����TextView��ʾ�����ݣ������Ǵ���ڶ�̬�����е����� */
		holder.title.setText(getDate().get(position).get("ItemTitle")
				.toString());
		holder.text.setText(getDate().get(position).get("ItemText").toString());
		holder.bt.setText(getDate().get(position).get("ItemButton").toString());

		/* ΪButton��ӵ���¼� */
		holder.bt.setOnClickListener(new AdapterView.OnClickListener() {

			@Override
			public void onClick(View v) {
				Log.v("MyListViewBase", "�����˰�ť" + (position + 1)); // ��ӡButton�ĵ����Ϣ

			}
		});

		return convertView;
	}

	/* ��ſؼ� */
	public final class ViewHolder {
		public TextView title;
		public TextView text;
		public Button bt;
	}

	/* ���һ���õ����ݵķ���������ʹ�� */
	private ArrayList<HashMap<String, Object>> getDate() {

		ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();
		/* Ϊ��̬����������� */
		for (int i = 0; i < 30; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemTitle", "��" + (i + 1) + "��");
			map.put("ItemText", "���ǵ�" + (i + 1) + "��");
			map.put("ItemButton", "Button" + (i + 1));
			listItem.add(map);
		}
		return listItem;

	}
}
