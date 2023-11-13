<?php
// Oracle 데이터베이스에 연결
$conn = oci_connect('hr', 'hr', 'localhost:1521/ORCL');

// 쿼리 실행
$query = 'SELECT job_title, min_salary FROM jobs';
$stid = oci_parse($conn, $query);
oci_execute($stid);

// 데이터 가져와서 형식화
$rows = array();
while ($row = oci_fetch_assoc($stid)) {
    $rows[] = array($row['JOB_TITLE'], (int)$row['MIN_SALARY']);
}

// Oracle 연결 닫기
oci_free_statement($stid);
oci_close($conn);

// 데이터를 클라이언트 측 JavaScript에 전달
echo '<script>var jobData = ' . json_encode($rows) . ';</script>';
?>
