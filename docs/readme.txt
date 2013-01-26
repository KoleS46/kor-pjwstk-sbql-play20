Aby uruchomić program należy wykonać w kolejności (wymagane srodowisko linuxowe):
jeżeli nie mamy unzip
to na ubuntu debianie mincie
sudo apt-get install unzip

odplanie aplikacji

z poziomu eclipse zbudować projekt za pomoca anta następnie

cd s10091_kor
chmod +x run.sh
./run.sh

poczekać ściagniecie frameworka play2.0
i odpalenie serwera deweloperskiego
nastepnie wejść w przegladarce na adres
	http://localhost:9000
(chwile może to trwać ponieważ kompilowane są wszystkie templatki i klasy javowe)

jeżeli wprzegladarce pojawił się komunikat zawierajcay w treści korData.db
nalezy wykonać:

z poziomu eclipse zbudować projekt za pomoca anta następnie
./run.sh # (framework sciaga sie tylko raz)