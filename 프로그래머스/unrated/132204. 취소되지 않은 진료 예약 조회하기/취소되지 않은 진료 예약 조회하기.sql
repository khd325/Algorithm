select a.apnt_no, a.pt_name, a.pt_no, a.mcdp_cd, doctor.dr_name, a.apnt_ymd from doctor 
join (select appointment.apnt_no, patient.pt_name, patient.pt_no, appointment.apnt_ymd, appointment.mcdp_cd, appointment.mddr_id 
from appointment
join patient 
on appointment.pt_no = patient.pt_no
where apnt_ymd like '2022-04-13%' and apnt_cncl_yn = 'N') as a
on doctor.dr_id = a.mddr_id
order by a.apnt_ymd;