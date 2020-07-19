import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AjouterCinemasComponent } from './ajouter-cinemas.component';

describe('AjouterCinemasComponent', () => {
  let component: AjouterCinemasComponent;
  let fixture: ComponentFixture<AjouterCinemasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AjouterCinemasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AjouterCinemasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
