import { TestBed } from '@angular/core/testing';

import { ServiceFilmsService } from './service-films.service';

describe('ServiceFilmsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceFilmsService = TestBed.get(ServiceFilmsService);
    expect(service).toBeTruthy();
  });
});
