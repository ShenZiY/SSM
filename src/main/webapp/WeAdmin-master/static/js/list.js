layui.extend({
	admin:  '{/}../../static/js/admin'
});

layui.use(['table', 'jquery','form', 'admin'], function() {
	var table = layui.table,
		$ = layui.jquery,
		form = layui.form,
		admin = layui.admin;

	table.render({
		elem: '#articleList',
		cellMinWidth: 40,
		cols: [
			[{
				field: 'id',title: 'ID',sort: true
			}, {
				field: 'title',title: '标题',templet: '#usernameTpl'
			}, {
				field: 'date',title: '发布时间',sort: true
			}, {
				field: 'category',title: '分类',sort: true
			}, {
				field: 'sort',title: '排序',sort: true
			}, {
				field: 'recommend',title: '推荐',templet: '#recommendTpl',unresize: true
			}, {
				field: 'top',title: '置顶',templet: '#topTpl',unresize: true
			}, {
				field: 'review',title: '审核',templet: '#reviewTpl',unresize: true
			}, {
				field: 'operate',title: '操作',toolbar: '#operateTpl',unresize: true
			}]
		],
		data: [{
			"id": "1",
			"title": "WeAdmin的第一个版本在不断地抽空完善学习中",
			"date": "2018-02-03",
			"category": "官方动态",
			"sort": "1",
			"recommend": "checked",
			"top": "checked"
		}, {
			"id": "2",
			"title": "WeAdmin的测试数据一二三四五六七",
			"date": "2018-02-03",
			"category": "新闻资讯",
			"sort": "1",
			"recommend": "",
			"top": "checked"
		}, {
			"id": "3",
			"title": "WeAdmin的测试数据一二三四五六七",
			"date": "2018-02-03",
			"category": "新闻资讯",
			"sort": "1",
			"recommend": "",
			"top": "checked"
		}, {
			"id": "4",
			"title": "WeAdmin的测试数据一二三四五六七",
			"date": "2018-02-03",
			"category": "新闻资讯",
			"sort": "1",
			"recommend": "",
			"top": "checked"
		}, {
			"id": "5",
			"title": "WeAdmin的测试数据一二三四五六七",
			"date": "2018-02-03",
			"category": "新闻资讯",
			"sort": "1",
			"recommend": "",
			"top": "checked"
		}, {
			"id": "6",
			"title": "WeAdmin的测试数据一二三四五六七",
			"date": "2018-02-03",
			"category": "新闻资讯",
			"sort": "1",
			"recommend": "",
			"top": "checked"
		}, {
			"id": "7",
			"title": "WeAdmin的测试数据一二三四五六七",
			"date": "2018-02-03",
			"category": "新闻资讯",
			"sort": "1",
			"recommend": "",
			"top": "checked"
		}, {
			"id": "8",
			"title": "WeAdmin的测试数据一二三四五六七",
			"date": "2018-02-03",
			"category": "新闻资讯",
			"sort": "1",
			"recommend": "",
			"top": "checked"
		
		}, {
			"id": "9",
			"title": "WeAdmin的测试数据一二三四五六七",
			"date": "2018-02-03",
			"category": "新闻资讯",
			"sort": "1",
			"recommend": "",
			"top": "checked"
		
		}, {
			"id": "10",
			"title": "WeAdmin的测试数据一二三四五六七",
			"date": "2018-02-03",
			"category": "新闻资讯",
			"sort": "1",
			"recommend": "",
			"top": "checked"
		
		}, {
			"id": "11",
			"title": "WeAdmin的测试数据一二三四五六七",
			"date": "2018-02-03",
			"category": "新闻资讯",
			"sort": "1",
			"recommend": "",
			"top": "checked"
		
		}, {
			"id": "12",
			"title": "WeAdmin的测试数据一二三四五六七",
			"date": "2018-02-03",
			"category": "新闻资讯",
			"sort": "1",
			"recommend": "",
			"top": "checked"
		
		}],
		page: true,
		even:true
	});
	
});
