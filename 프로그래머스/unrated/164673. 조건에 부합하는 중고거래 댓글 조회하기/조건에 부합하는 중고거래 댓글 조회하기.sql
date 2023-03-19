-- 코드를 입력하세요
SELECT usb.title, usb.board_id, ugr.reply_id, ugr.writer_id, ugr.contents, date_format(ugr.created_date, '%Y-%m-%d') as created_date from used_goods_board usb join used_goods_reply ugr on usb.board_id = ugr.board_id
where usb.created_date like '2022-10%' order by created_date, title;